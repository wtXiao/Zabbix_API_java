package com.zabbix.api.test;

import java.util.List;

public class WindowsMonitorInfos {
	
	//General
	private String systeminformation;		//系统类型信息
	private String systemuptime;			//系统启动时间
	//CPU
	private String cpuusedpercentage;		//cpu使用率 （window中取得是system，linux取得事user）
	private String cpunum;					//cpu核数
	private String cpuinterrupt;			//cpu中断率
	//Memory
	private String freememory;		   	    //空闲内存
	private String totalmemory;				//总内存
	private String availablememory;			//可使用的内存
	//Filesystems
	private List<DiskInfos> diskinfos;		//磁盘信息
	//Network interfaces
	private List<NetWorkInfos> netWorkInfos;//网口信息
	//Processes 
	private String  numberofprocesses ;		//进程数
	//swap
	private String freeswapspace;			//空闲交换空间
	private String totalswapspace;			//总交换空间

}
