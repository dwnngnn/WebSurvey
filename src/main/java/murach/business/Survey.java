package murach.business;

import java.io.Serializable;

public class Survey implements Serializable {
    private String heardFrom;
    private boolean announcements;
    private boolean emailAnnouncements;
    private String contactVia;

    public Survey() {}

    public String getHeardFrom() { return heardFrom; }
    public void setHeardFrom(String heardFrom) { this.heardFrom = heardFrom; }

    public boolean isAnnouncements() { return announcements; }
    public void setAnnouncements(boolean announcements) { this.announcements = announcements; }

    public boolean isEmailAnnouncements() { return emailAnnouncements; }
    public void setEmailAnnouncements(boolean emailAnnouncements) { this.emailAnnouncements = emailAnnouncements; }

    public String getContactVia() { return contactVia; }
    public void setContactVia(String contactVia) { this.contactVia = contactVia; }
}