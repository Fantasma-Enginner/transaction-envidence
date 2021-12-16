package org.Transaction.Evidence.model;



public class FileModel {

	private String images;
    private String imagestype ;
    

    public FileModel() {
    }

    public FileModel(String imagestype, String images) {
        this.imagestype = imagestype;
        this.images = images;
    }

	public String getImagestype() {
		return imagestype;
	}

	public void setImagestype(String imagestype) {
		this.imagestype = imagestype;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}


}
