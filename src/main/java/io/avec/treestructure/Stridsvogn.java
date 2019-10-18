package io.avec.treestructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by avec112 on 17.10.19.
 */
@AllArgsConstructor
@Getter
@ToString
public class Stridsvogn implements Enhet {
    private String dekkmerke;
    private String vk;
}
