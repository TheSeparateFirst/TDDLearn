package testingscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class AlbumTest extends FunSpec with Matchers {
  describe("An album") {
    it ("can add an Artist to the album") {
      val album = new Album("The Wall", 1979,
        new Artist("Pink Floyd",
          Array(new BandMember("Roger", "Waters"),
                new BandMember("James", "Guthrie"),
                new BandMember("Bob", "Ezrin"),
                new BandMember("David", "Gilmour"))))
      println(album)
    }
  }
}