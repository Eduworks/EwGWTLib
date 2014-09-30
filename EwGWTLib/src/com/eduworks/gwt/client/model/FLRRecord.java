package com.eduworks.gwt.client.model;

import com.eduworks.gwt.client.net.packet.ESBPacket;

public class FLRRecord extends FileRecord {
   
    public final static String FLR_DOC_ID = "flrDocId_t";
    public final static String FLR_PARADATA_ID = "flrParadataId_t";

	private String flrDocId = "";
	private String flrParadataId = "";
	
	public FLRRecord() {}
	
	public FLRRecord (ESBPacket esbPacket) {
      super.parseESBPacket(esbPacket);
      ESBPacket parsePacket;
      if (esbPacket.containsKey("obj")) parsePacket = new ESBPacket(esbPacket.get("obj").isObject());
      else parsePacket = esbPacket;
      if (parsePacket.containsKey(FLR_DOC_ID)) flrDocId = esbPacket.getString(FLR_DOC_ID);
      if (parsePacket.containsKey(FLR_PARADATA_ID)) flrParadataId = esbPacket.getString(FLR_PARADATA_ID);
    }
	
    public String getFlrDocId() {return flrDocId;}
    public void setFlrDocId(String flrDocId) {this.flrDocId = flrDocId;}
    public String getFlrParadataId() {return flrParadataId;}
	public void setFlrParadataId(String flrParadataId) {this.flrParadataId = flrParadataId;}
   
}
