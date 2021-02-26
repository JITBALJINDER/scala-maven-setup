import com.typesafe.config.{Config, ConfigFactory}

object ScalaMain {

  def main(args: Array[String]): Unit = {
    val conf: Config = ConfigFactory.load()

    println(conf.getString("environment"))
  }
}
