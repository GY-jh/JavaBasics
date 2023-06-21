public class Demo17LoopHourAndMinute {
	public static void main(String[] args) throws InterruptedException {
		for (int hour = 0; hour < 24; hour++) { // 外层控制小时
			for (int minute = 0; minute < 60; minute++) { // 内层控制小时之内的分钟
				for (int Seconds = 0; Seconds < 60; Seconds++){
					System.out.println(hour + "点" + minute + "分" + Seconds + "秒");
					Thread.sleep(1000);
				}
			}
		}
	}
}