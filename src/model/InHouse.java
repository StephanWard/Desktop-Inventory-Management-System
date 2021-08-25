package model;

/**
 * This creates an in-house part model
 *
 * @author Stephan Ward Created on 06/12/2021
 *
 */
public class InHouse extends Part {

    /**
     * The machine ID for the part
     */
    private int machineId;

    /**
     * Creating the constructor for the new instance of the InHouse object.
     *
     * @param id the ID for the part
     * @param name the name of the part
     * @param price the price of the part
     * @param stock the inventory level of the part
     * @param min the minimum level for the part
     * @param max the maximum level for the part
     * @param machineId the machine ID for the part
     */
    public InHouse(int id, String name, double price, int stock, int min, int max, int machineId) {
        super(id, name, price, stock, min, max);
        this.machineId = machineId;
    }

    /**
     * The getter for a machineId
     *
     * @return machineId for the part
     */
    public int getMachineId() {
        return machineId;
    }

    /**
     * The setter for a machineId
     *
     * @param machineId the machineId for the part
     */
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
}
