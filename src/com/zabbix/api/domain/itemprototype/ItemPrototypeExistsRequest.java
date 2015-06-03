package com.zabbix.api.domain.itemprototype;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class ItemPrototypeExistsRequest extends RequestBase{
	public ItemPrototypeExistsRequest() {
		super("itemprototype.exists");
	}
	private ItemPrototypeExistsParams params = new ItemPrototypeExistsParams();
	public void setParams(ItemPrototypeExistsParams params) {
		this.params = params;
	}
	public ItemPrototypeExistsParams getParams() {
		return params;
	}
	public static class ItemPrototypeExistsParams{
		private String key_;
		private String host;
		private List<String> hostid;
		private String node;
		private List<String> nodeids;
		public void setKey_(String key_) {
			this.key_ = key_;
		}
		public String getKey_() {
			return key_;
		}
		public void setHost(String host) {
			this.host = host;
		}
		public String getHost() {
			return host;
		}
		public void setHostid(List<String> hostid) {
			this.hostid = hostid;
		}
		public List<String> getHostid() {
			 if(hostid==null){
				hostid   = new ArrayList<String>();
				return hostid;
			}
			 return hostid;
		}
		public void setNode(String node) {
			this.node = node;
		}
		public String getNode() {
			return node;
		}
		public void setNodeids(List<String> nodeids) {
			this.nodeids = nodeids;
		}
		public List<String> getNodeids() {
			 if(nodeids==null){
				nodeids   = new ArrayList<String>();
				return nodeids;
			}
			 return nodeids;
		}
	}
}
