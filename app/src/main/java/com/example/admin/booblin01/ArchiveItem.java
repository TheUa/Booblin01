package com.example.admin.booblin01;

/**
 * Created by Admin on 26.01.2016.
 */
public class ArchiveItem {

    private String archiveDate;
    private String archiveSumm;
    private int archiveId;

    public ArchiveItem(int i, String string, String summ) {
        this.archiveId = i;
        this.archiveDate = string;
        this.archiveSumm = summ;
    }
    @Override
    public String toString() {
        return this.archiveDate;
    }
//    public String string() {
//        return this.archiveSumm + "  -  " + this.archiveSumm;
//    }

    public ArchiveItem(String string, String summ) {
        this.archiveDate = string;
        this.archiveSumm = summ;
    }
    public ArchiveItem() {
    }

    public int getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(int archiveId) {
        this.archiveId = archiveId;
    }


    public String getArchiveDate() {
        return archiveDate;
    }

    public void setArchiveDate(String archiveDate) {
        this.archiveDate = archiveDate;
    }

    public String getArchiveSumm() {
        return archiveSumm;
    }

    public void setArchiveSumm(String archiveSumm) {
        this.archiveSumm = archiveSumm;
    }

}
