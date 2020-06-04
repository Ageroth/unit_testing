package pl.lodz.p.zzpj.testing.assertj;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

public class FellowshipAssertionTest {

    private Fellowship fellowship = formTheFellowshipOfTheRing();

    @Test
    public void frodoShouldBeIn() {
        assertThat(fellowship).extracting("name").contains("Frodo");
    }

    @Test
    public void sauronShouldNotBeIn() {
        assertThat(fellowship).extracting("name").doesNotContain("Sauron");
    }

    @Test
    public void shouldFrodoNameBeCorrectAndNotBeASauronAndBeInFellowship() {
        assertThat(fellowship.get(0))
                .isIn(fellowship);
    }

    @Test
    public void aragornShouldBeBeforeBoromir() {
        assertThat(fellowship).extracting("name").containsSequence("Aragorn", "Boromir");
    }

    @Test
    public void shouldNotContainDuplicatedFellows() {
        assertThat(fellowship).extracting("name")
                .containsExactlyInAnyOrder("Frodo", "Sam", "Pippin",
                        "Merry", "Gimli", "Legolas",
                        "Gandalf", "Boromir", "Aragorn");
    }

    @Test
    public void shouldContainOnlyFellowsWithExpectedNamesInProperOrder() {
        assertThat(fellowship).extracting("name")
                .containsExactly("Frodo", "Sam", "Merry",
                        "Pippin", "Gandalf", "Legolas",
                        "Gimli", "Aragorn", "Boromir");
    }

    @Test
    public void shouldContainNineFellowsButNoneGiant() {
        assertThat(fellowship).hasSize(9).extracting("race").doesNotContain(Fellow.Race.GIANT);
    }

    @Test
    public void shouldContainTupleForBoromirSamAndLegolas() {
        assertThat(fellowship).extracting("name", "race")
                .contains(tuple("Boromir", Fellow.Race.MAN),
                        tuple("Sam", Fellow.Race.HOBBIT),
                        tuple("Legolas", Fellow.Race.ELF));
    }

    @Test
    public void shouldContainsFourHobbits() {
        assertThat(fellowship.hobbits()).hasSize(4);
    }


    private Fellowship formTheFellowshipOfTheRing() {
        return new Fellowship(
                FellowTestFixture.frodo(),
                FellowTestFixture.sam(),
                FellowTestFixture.merry(),
                FellowTestFixture.pippin(),
                FellowTestFixture.gandalf(),
                FellowTestFixture.legolas(),
                FellowTestFixture.gimli(),
                FellowTestFixture.aragorn(),
                FellowTestFixture.boromir());
    }
}
