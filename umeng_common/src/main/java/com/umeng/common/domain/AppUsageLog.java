package com.umeng.common.domain;

/**
 * 使用日志
 */
public class AppUsageLog extends AppBaseLog {
	private Long singleUseDurationSecs;      //单次使用时长
	private Long singleUploadTraffic;        //单次使用过程中的上传流量
	private Long singleDownloadTraffic;      //单次使用过程中的下载流量

	public Long getSingleUseDurationSecs() {
		return singleUseDurationSecs;
	}

	public void setSingleUseDurationSecs(Long singleUseDurationSecs) {
		this.singleUseDurationSecs = singleUseDurationSecs;
	}

	public Long getSingleUploadTraffic() {
		return singleUploadTraffic;
	}

	public void setSingleUploadTraffic(Long singleUploadTraffic) {
		this.singleUploadTraffic = singleUploadTraffic;
	}

	public Long getSingleDownloadTraffic() {
		return singleDownloadTraffic;
	}

	public void setSingleDownloadTraffic(Long singleDownloadTraffic) {
		this.singleDownloadTraffic = singleDownloadTraffic;
	}
}