package com.zabbix.api.domain.item;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class ItemExistsRequest extends RequestBase{
	public ItemExistsRequest() {
		super("item.exists");
	}
	private ItemExistsParams params = new ItemExistsParams();
	public void setParams(ItemExistsParams params) {
		this.params = params;
	}
	public ItemExistsParams getParams() {
		return params;
	}
	public static class ItemExistsParams{
		private List<String> key_;
		private List<String> host;
		private List<String> hostid;
		private String node;
		private List<String> nodeids;
		public void setKey_(List<String> key_) {
			this.key_ = key_;
		}
		public List<String> getKey_() {
			 if(key_==null){
				key_   = new ArrayList<String>();
				return key_;
			}
			 return key_;
		}
		public void setHost(List<String> host) {
			this.host = host;
		}
		public List<String> getHost() {
			 if(host==null){
				host   = new ArrayList<String>();
				return host;
			}
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
