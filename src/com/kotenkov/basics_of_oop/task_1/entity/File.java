package com.kotenkov.basics_of_oop.task_1.entity;

public abstract class File {

    protected FileType type;
    protected int number;
    protected String name;
    protected int size;

    protected File(FileType type, String name, int size){
        this.type = type;
        this.name = name;
        this.size = size;
    }

    public abstract void printContent();
    public abstract void addContent(String newContent);
    public abstract void deleteAllContent();

    public FileType getType() {
        return type;
    }

    public void setType(FileType type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        if (type != file.type) return false;
        return name.equals(file.name);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "File{" +
                "type=" + type +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
