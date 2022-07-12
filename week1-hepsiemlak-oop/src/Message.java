import java.util.ArrayList;
import java.util.List;

public class Message {
    private String messageTitle;
    private String description;
    private String sentDate;
    private String readDate;
    private Boolean isSeen;
    private String postingUser;
    private String domainUser;

    public Message(String messageTitle, String description, String sentDate, String readDate, Boolean isSeen, String postingUser, String domainUser) {
        this.messageTitle = messageTitle;
        this.description = description;
        this.sentDate = sentDate;
        this.readDate = readDate;
        this.isSeen = isSeen;
        this.postingUser = postingUser;
        this.domainUser = domainUser;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSentDate() {
        return sentDate;
    }

    public void setSentDate(String sentDate) {
        this.sentDate = sentDate;
    }

    public String getReadDate() {
        return readDate;
    }

    public void setReadDate(String readDate) {
        this.readDate = readDate;
    }

    public Boolean isSeen() {
        return isSeen;
    }

    public void setSeen(Boolean seen) {
        isSeen = seen;
    }

    public String getPostingUser() {
        return postingUser;
    }

    public void setPostingUser(String postingUser) {
        this.postingUser = postingUser;
    }

    public String getDomainUser() {
        return domainUser;
    }

    public void setDomainUser(String domainUser) {
        this.domainUser = domainUser;
    }

    public static List<Message> prepareMessageBox() {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Message 1", "Takas düşünür müsün ?", "10.12.2021", "11.12.2021", true, "Ahmet Mehmet", "Ayşe Sarı"));
        messages.add(new Message("Message 2", "Hala satılık mı ?", "06.01.2022", "07.01.2022", true, "Zeynep Yılmaz", "Ayşe Sarı"));
        messages.add(new Message("Message 3", "En son ne kadar olur ?", "10.02.2022", "11.02.2022", true, "Ali Akkaya", "Ayşe Sarı"));
        messages.add(new Message("Message 4", "Son ne olur ?", "10.01.2022", "11.01.2022", true, "Funda Keser", "Yılmaz Güney"));
        messages.add(new Message("Message 5", "Takas var mı ?", "15.02.2022", "16.02.2022", true, "Mehmet Yıldız", "Yılmaz Güney"));
        messages.add(new Message("Message 6", "Kiralık olur mu ?", "08.03.2022", "09.03.2022", true, "Lale Atay", "Yılmaz Güney"));
        return messages;
    }

    public static void showMessageList() {
        for (Message message : prepareMessageBox()) {
            System.out.println("Message Title: " + message.getMessageTitle()
                    +"\nMessage Description: " + message.getDescription()
                    +"\nMessage Sent Date: " +  message.getSentDate()
                    +"\nMessage Read Date: " +  message.getReadDate()
                    +"\nMessage Is Seen ?: " +  message.isSeen()
                    +"\nMessage Posting User: " +  message.getPostingUser()
                    +"\nMessage Domain User: " +  message.getDomainUser() + "\n");
        }
    }
}