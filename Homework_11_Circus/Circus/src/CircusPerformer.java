public class CircusPerformer {
    private String name;
    private String act;
    private int experience;

    // constructor
    public CircusPerformer(String name, String act, int experience) throws InvalidExperienceException {
        this.name = name;
        this.act = act;
        try {
            if (experience < 0 || experience > 50) {
                throw new InvalidExperienceException("Experience must be between 0 and 50 years.");
            }
            this.experience = experience;
        } catch (InvalidExperienceException e) {
            System.out.println(e.getMessage());
            this.experience = 0; // Set default experience if exception occurs
        }
    }

    public String getName() {
        return name;
    }

    public String getAct() {
        return act;
    }

    public int getExperience() {
        return experience;
    }

    @RunImmediately(times = 3)
    public String getPerformerInfo() {
        return "Name: " + name + ", Act: " + act + ", Experience: " + experience + " years";
    }
}


