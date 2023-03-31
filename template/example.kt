abstract class CoffeineMaker {
  fun prepare(){
    boilWater()
    addGredient()
    addExtras()
    pourInCup()
    
  }
  fun boilWater(){
    println("Boiling water")
  }

  abstract fun addGredient()
  abstract fun addExtras()
  
  fun pourInCup(){
    println("Pouring into cup")
  }
  
}

class TeaMaker: CoffeineMaker{
  override fun addGredient(){
    println("Steeping the tea")
  }
  override fun addExtras(){
    println("Adding Lemon")
  }
}

class CoffeeMaker: CoffeineMaker {
   override fun addGredient(){
    println("Dripping Coffee through filter")
  }
  override fun addExtras(){
    println("Adding Sugar and Milk")
  }

}