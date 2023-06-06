fun main(args: Array<String>) {
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86

    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore / 3
    println(totalScore)
    println(averageScore)

    val boostMultiplier= 4
    val scoreBoost= totalScore * boostMultiplier
    val finalBoostedScore = totalScore+scoreBoost
}