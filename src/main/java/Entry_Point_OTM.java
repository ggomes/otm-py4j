import py4j.GatewayServer;

public class Entry_Point_OTM {

	private api.API api;

	public Entry_Point_OTM() {
		api = new api.API();
	}

	public api.API get_OTM_API(){
		return api;
	}

	public static void main(String[] args) throws Exception {
		GatewayServer gatewayServer=null;
		try{
//			InetAddress s = gatewayServer.getAddress();
			if(1==args.length)
				gatewayServer = new GatewayServer(new Entry_Point_OTM(),Integer.parseInt(args[0]));
			else
				gatewayServer = new GatewayServer(new Entry_Point_OTM());
			gatewayServer.start();
			System.out.println("Gateway Server Started on port " + gatewayServer.getPort());

		} catch(Exception e){
			if(gatewayServer!=null)
				gatewayServer.shutdown();
			throw new Exception("Could not initialize Java Gateway");
		}
	}

}
