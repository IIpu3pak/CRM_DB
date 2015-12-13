package org.servicecrm.catalogs.communications;

import org.servicecrm.*;
import org.servicecrm.catalogs.organizations.Company;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Set;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Contact implements Communicable, Serializable {

    private int id;
    private String name;
    private Position position;
    private User owner;
    private GregorianCalendar dateOfCreate;
    private Company company;
    private Set<Communication> communications;
    private Set<File> files;
    private Set<Comment> comments;
    private Set<Tag> tags;
    private Set<CustomField> customFields;

    public Contact() {

    }

    public void setCommunications(Set<Communication> communications) {
        this.communications = communications;
    }

    public Set<Communication> getCommunications() {
        return communications;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public GregorianCalendar getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(GregorianCalendar dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Set<File> getFiles() {
        return files;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Set<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Set<CustomField> customFields) {
        this.customFields = customFields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact contact = (Contact) o;

        if (getId() != contact.getId()) return false;
        return !(getName() != null ? !getName().equals(contact.getName()) : contact.getName() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " (Company: "+ company +", position: " + position + ")";
    }
}
