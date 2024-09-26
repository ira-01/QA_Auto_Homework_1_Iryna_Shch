interface MessageInterface {
    User getSender();
    User getRecipient();
    String getText();
    MessageStatus getStatus();

    void setStatus(MessageStatus status);
}
