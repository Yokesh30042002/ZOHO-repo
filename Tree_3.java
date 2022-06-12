
import java.util.*;
class PathRecu{
	int row, col;
	List<List<Integer>> array;
	PathRecu(){
		array   = new ArrayList<List<Integer>>();
	}

	public boolean isOk(int x, int y){
		if ((x>=0 && x<row) && (y>=0 && y<col)){
			return true;
		}else{
			return false;
		}
	}

	public List<List<Integer>> findPath(int x, int y){
		List<List<Integer>> tempList = new ArrayList<List<Integer>>();
		if(array.get(x).get(y)==array.get(row-1).get(col-1)){
			List<Integer>  subTempList   = new ArrayList<Integer>();
			subTempList.add(array.get(x).get(y));
			tempList.add(subTempList);
			return tempList;
		}
		else{
			int ele = array.get(x).get(y);
			if(isOk(x,y+1)){
				for(List<Integer> subTempList : findPath(x,y+1)){
					List<Integer> subResultList = new ArrayList<Integer>();
					subResultList.add(ele);
					for(Integer i : subTempList)
						subResultList.add(i);
					tempList.add(subResultList);
				}
			}if(isOk(x+1, y)){
				for(List<Integer> subTempList : findPath(x+1,y)){
					List<Integer> subResultList = new ArrayList<Integer>();
					subResultList.add(ele);
					for(Integer i : subTempList)
						subResultList.add(i);
					tempList.add(subResultList);
				}
			}
		}
		return tempList;
	}

	public static void main(String[] args) {
		PathRecu obj = new PathRecu();
		obj.row=3;
		obj.col=3;
		int count=1;
		for(int i=0;i<3;i++){
			List<Integer> temp = new ArrayList<>();
			for(int j=0;j<3;j++){
				temp.add(count);
				count++;
			}
			obj.array.add(temp);
		}

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result = obj.findPath(0,0);
		for(int i=0;i<result.size();i++){
			for (int j=0;j<result.get(i).size();j++ ) {
				System.out.print(result.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}
