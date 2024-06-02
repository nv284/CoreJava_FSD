package com.sim.demo5;
// example of wait , notify and notifyall
class Message {
    private String msg;

	public Message(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
    
    

}
class Waiter implements Runnable{
    
    private Message msg;
    
    public Waiter(Message m){
        this.msg=m;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try{
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                msg.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+msg.getMsg());
        }
    }
}

class Notifier implements Runnable{
	private Message msg ;
	public Notifier(Message msg) {
        this.msg = msg;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println(name+" started");
		try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMsg(name +"  Notifier work done ");
				msg.notify();
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	} 
	
}
