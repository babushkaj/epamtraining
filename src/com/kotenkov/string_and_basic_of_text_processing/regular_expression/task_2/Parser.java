package com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private int counter = 0;
    private StringBuilder s;
    private StringBuilder tmp;
    private StringBuilder processedNode;

    public Parser(String s) {
        this.s = new StringBuilder(s);
        this.tmp = new StringBuilder();
        this.processedNode = new StringBuilder();
    }

    public void startParsing(){
        StringBuilder cycleString = new StringBuilder();
        Event e = new Event();
        while(counter < s.length()){
            tmp.delete(0, tmp.length());
            tmp.append(s.substring(counter));
            cycleString.delete(0, cycleString.length());
            cycleString.append(findStartElement(tmp.toString()));

            if(cycleString.length() > 0){
                String methodString = cycleString.toString();
                String tagName = findTagName(methodString);
                String tagAttr = findTagAttr(methodString);
                if(tagAttr.length() > 0){
                    e.startElement(tagName, findAttrName(tagAttr), findAttrContent(tagAttr));
                } else {
                    e.startElement(tagName);
                }
                counter += cycleString.length();
                continue;
            }

            cycleString.append(findEndElement(tmp.toString()));

            if(cycleString.length() > 0){
                String methodString = cycleString.toString();
                String tagName = findTagName(methodString);
                e.endElement(tagName);
                counter += cycleString.length();
                continue;
            }

            cycleString.append(findNoBodyElement(tmp.toString()));

            if(cycleString.length() > 0){
                String methodString = cycleString.toString();
                String tagName = findTagName(methodString);
                e.noBodyElement(tagName);
                counter += cycleString.length();
                continue;
            }

            cycleString.append(findContentElement(tmp.toString()));

            if(cycleString.length() > 0){
                String methodString = cycleString.toString();
                e.tagContent(methodString.trim());
                counter += cycleString.length();
                continue;
            }

            System.out.println("Программа не смогла обнаружить очередной элемент и была остановлена.");
            break;
        }
    }

    private String findSomeNode(String str, String pattern){
        processedNode.delete(0,processedNode.length());
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        if (m.lookingAt()){
            processedNode.append(m.group());
        }
        return processedNode.toString();
    }


    private String findStartElement(String str){
        return findSomeNode(str, "[\\s\\n\\t]*(<[\\w\\d\\s\"=]+>)+?");
    }

    private String findEndElement(String str){
        return findSomeNode(str, "[\\s\\n]*(</[\\w\\d]+>)+?");
    }

    private String findNoBodyElement(String str){
        return findSomeNode(str, "[\\s\\n\\t]*(<[\\w\\d]+/>)+?");
    }

    private String findContentElement(String str){
        return findSomeNode(str, "(\\s*[[а-яА-Я\\?!:,\\.]\\d\\s]+)+?");
    }

    private String findTagsPart(String tagContent, String pattern){
        String s = "";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(tagContent);
        if(m.find()){
            s = m.group(1);
        }
        return s;
    }

    private String findTagName(String tagContent){
        return findTagsPart(tagContent, "</?(\\w+)\\s*.*/?>");
    }

    private String findTagAttr(String tagContent){
        return findTagsPart(tagContent, "<\\w+\\s+(\\w[\\w\\d\\s\"=]+)>");
    }

    private String findAttrName(String attr){
        return findTagsPart(attr, "([\\w\\d]+)\\s=");
    }

    private String findAttrContent(String attr){
        return findTagsPart(attr, "\"([\\d]+)\"");
    }

}
