package com.thangaKafka;

public class MessageRequest {
    MessageRequest(int id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "ID :" + this.id + " Message:" + this.message;
    }

    int id;
    String message;


}
