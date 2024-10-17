package br.com.fitapp.domain.member.factory;

import br.com.fitapp.domain.member.entity.Member;

public class MemberFactory {
    public static Member create( String photoUrl, String discription, String name){
        return new Member(photoUrl, discription, name);
    }
}
