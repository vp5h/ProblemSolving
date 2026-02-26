class Badge {
    public String print(Integer id, String name, String department) {
        String finalStr = "";
        if(id!= null){
            finalStr = finalStr +  "[" + id + "]" + " - " ;
        }
        if(name!= null){
              finalStr = finalStr + name;
        }
        if(department!= null){
            
             finalStr = finalStr + " - " + department.toUpperCase();
        }else{
              finalStr = finalStr + " - OWNER";
        }
        return finalStr;
    }
}
