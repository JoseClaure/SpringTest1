package io.getarrays.securecapita.repository;

import io.getarrays.securecapita.domain.Role;
import io.getarrays.securecapita.domain.User;

import java.util.Collection;

public interface RoleRepository <T extends Role> {
    /* Basic CRUD Operations*/
    T create(T data);
    Collection<T> List(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);

    /* More complex operations*/
    void addRoleToUser(Long userid, String roleName);
    Role getRolebyUserId(Long userId);
    Role getRoleByUserEmail(String email);
    void updateUserRole(Long userId, String roleName);

}
