package testingscala

class Album (val title:String, val year:Int, val artist:Artist){
  override def toString: String = title + " by " + artist + " (" + year + ")"
}
