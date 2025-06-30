fun main(){
    // var numbers = arrayOf<Int>()
    // // generic type is integer it is explicit
    // // numbers = "string" // error


    val footballPlayer1 = FootballPlayer("Ronaldo")
    val footballPlayer2 = FootballPlayer("Messi")
    val basketballPlayer1 = BasketballPlayer("Jordan")
    val basketballPlayer2 = BasketballPlayer("Kobe")

    val footBallTeam = Team<FootballPlayer>("All Stars", mutableListOf(footballPlayer1, footballPlayer2))
    val basketBallTeam = Team<BasketballPlayer>("Hoop Stars", mutableListOf(basketballPlayer1, basketballPlayer2))

    footBallTeam.addPlayer(FootballPlayer("Neymar"))
    // footBallTeam.addPlayer(basketballPlayer1) // This will not be added as it's a different type
    footBallTeam.addPlayer(footballPlayer1)
}

class Team<T : Player>(val name : String, val players : MutableList<T>){
    fun addPlayer(player: T) {
        if(players.contains(player)){
            println("Player: ${(player as Player).name} already exists in the team.")
            return
        }else {
            players.add(player)
            println("Player: ${(player as Player).name} added.")
        }
    }
}

// It means:

// "T must be a subtype of Player (i.e. either Player itself or a class that inherits from Player)".

// This is called a bounded type parameter — you're saying "T is bounded by Player".



open class Player(val name : String)

class FootballPlayer(name: String) : Player(name) 

class BasketballPlayer(name: String) : Player(name)