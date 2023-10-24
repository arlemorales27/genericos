package ejemplo5;

import java.util.ArrayList;
import java.util.List;

class PersonaServiceImpl implements CrudService<PersonaDTO> {

    private List<PersonaDTO> personas = new ArrayList<>();

    @Override
    public void save(PersonaDTO persona) {
        personas.add(persona);
    }

    @Override
    public PersonaDTO get(int id) {
        return personas.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(PersonaDTO persona) {
        PersonaDTO p = get(persona.getId());
        if(p != null) {
            int index = personas.indexOf(p);
            personas.set(index, persona);
        }
    }

    @Override
    public void delete(int id) {
        PersonaDTO p = get(id);
        if(p != null) {
            personas.remove(p);
        }
    }

    @Override
    public List<PersonaDTO> getAll() {
        return personas;
    }

}