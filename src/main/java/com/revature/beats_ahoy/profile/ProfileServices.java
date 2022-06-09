package com.revature.beats_ahoy.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.beats_ahoy.util.interfaces.Serviceable;
import javax.transaction.Transactional;

@Service
public class ProfileServices implements Serviceable<Profile>{
}
