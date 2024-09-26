class Message implements MessageInterface {
    private User sender;
    private User recipient;
    private String text;
    private MessageStatus status;

    //constructor
    public Message(User sender, User recipient, String text, MessageStatus status) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.status = status;
    }

    @Override
    public User getSender() {
        return sender;
    }

    @Override
    public User getRecipient() {
        return recipient;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public MessageStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(MessageStatus status) {
        this.status = status;
    }
}
