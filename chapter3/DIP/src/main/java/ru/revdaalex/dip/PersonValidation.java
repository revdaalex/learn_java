package ru.revdaalex.dip;

import ru.revdaalex.dip.interfaces.Storage;
import ru.revdaalex.dip.interfaces.Validation;

/**
 * Class PersonValidation.
 * Created by revdaalex on 14.10.2016.
 */
public class PersonValidation implements Validation {
    /**
     * Method check person information before edit.
     * @param id id.
     * @param storage storage.
     * @return boolean value.
     */
    public boolean checkBeforeEdit(int id, Storage storage) {
        if (storage.getPersonMap().containsKey(id)){
            if (storage.getPersonMap().get(id).getName() != null){
                if (storage.getPersonMap().get(id).getAge() >= 0){
                    if (storage.getPersonMap().get(id).getId() >= 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
