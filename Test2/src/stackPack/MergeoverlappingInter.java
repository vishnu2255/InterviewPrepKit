package stackPack;

public class MergeoverlappingInter {

	static Stack sts = new Stack(6);
	static Stack ste = new Stack(6);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ars = {};
		int[] are = {};
		
		int start,end;
		
		sts.push(ars[0]);
		ste.push(are[0]);
		
		for(int i=1;i<ars.length;i++)
		{
			start =sts.peek();
			end  = ste.peek();
			
			if(end< ars[i])
			{
				sts.push(ars[i]);
				ste.push(are[i]);
			}
			else if(end < are[i])
			{
				end = are[i];
				sts.pop();
				ste.pop();
				
				sts.push(start);
				ste.push(end);
			}
		}
		
	}

}
