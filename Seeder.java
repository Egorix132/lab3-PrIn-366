package Model.gamefield;

// Абстрактный заполнитель поля
abstract public class Seeder {

    protected GameField _field;

    void setField(GameField field) {
        _field = field;
    }

    public void run() {
		// Сид робот
        seedRobot();
        seedCharacteristics();
        seedUnits();
    }

    abstract protected void seedRobot();

    abstract protected void seedCharacteristics();

	// сИД ЮНИТ
    abstract protected void seedUnits();
}
