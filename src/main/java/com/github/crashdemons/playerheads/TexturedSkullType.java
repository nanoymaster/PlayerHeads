/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.crashdemons.playerheads;

import java.util.UUID;
import org.shininet.bukkit.playerheads.Lang;
import org.shininet.bukkit.playerheads.Tools;
import java.util.HashMap;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;

/**
 * Enumeration of skulls with associated UUID (randomly assigned) and texture string.
 * 
 * This enum should match correspondingly named entries in bukkit EntityType enum.
 * 
 * Inspired by shininet-CustomSkullType, presumably by meiskam
 * @author crash
 */
public enum TexturedSkullType {
    
    //Entity skull settings - big thanks to MagmaVoid_ for finding all of these textures.
    ELDER_GUARDIAN(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "fe2a7a7e-d140-4996-9922-e1fb124fb9f7",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWM3OTc0ODJhMTRiZmNiODc3MjU3Y2IyY2ZmMWI2ZTZhOGI4NDEzMzM2ZmZiNGMyOWE2MTM5Mjc4YjQzNmIifX19"
    ),
    WITHER_SKELETON(
        Material.WITHER_SKELETON_SKULL,
        Material.WITHER_SKELETON_WALL_SKULL,
        "c5b5a5a5-8a1d-4c0b-8e9f-5dd4ac8ab9d6",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzk1M2I2YzY4NDQ4ZTdlNmI2YmY4ZmIyNzNkNzIwM2FjZDhlMWJlMTllODE0ODFlYWQ1MWY0NWRlNTlhOCJ9fX0="
    ),
    STRAY(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "d051ef24-d218-44bf-95e1-fb30174237f1",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzhkZGY3NmU1NTVkZDVjNGFhOGEwYTVmYzU4NDUyMGNkNjNkNDg5YzI1M2RlOTY5ZjdmMjJmODVhOWEyZDU2In19fQ=="
    ),
    HUSK(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "9bfd4d16-7232-49d3-bfd8-c965e57ba899",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDY3NGM2M2M4ZGI1ZjRjYTYyOGQ2OWEzYjFmOGEzNmUyOWQ4ZmQ3NzVlMWE2YmRiNmNhYmI0YmU0ZGIxMjEifX19"
    ),
    ZOMBIE_VILLAGER(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "8de04954-9398-4e7c-b2c3-a0684b5b5929",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTVlMDhhODc3NmMxNzY0YzNmZTZhNmRkZDQxMmRmY2I4N2Y0MTMzMWRhZDQ3OWFjOTZjMjFkZjRiZjNhYzg5YyJ9fX0="
    ),
    SKELETON_HORSE(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "3d84a760-800d-4f87-a537-18446aad8623",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDdlZmZjZTM1MTMyYzg2ZmY3MmJjYWU3N2RmYmIxZDIyNTg3ZTk0ZGYzY2JjMjU3MGVkMTdjZjg5NzNhIn19fQ=="
    ),
    ZOMBIE_HORSE(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "4bde7ee9-e719-4e2a-9249-26a3b8ac765e",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDIyOTUwZjJkM2VmZGRiMThkZTg2ZjhmNTVhYzUxOGRjZTczZjEyYTZlMGY4NjM2ZDU1MWQ4ZWI0ODBjZWVjIn19fQ=="
    ),
    DONKEY(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "96bc6d6d-3599-49fa-b044-353f288da370",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjNhOTc2YzA0N2Y0MTJlYmM1Y2IxOTcxMzFlYmVmMzBjMDA0YzBmYWY0OWQ4ZGQ0MTA1ZmNhMTIwN2VkYWZmMyJ9fX0="
    ),
    MULE(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "59c3af02-e6d8-481c-b0e3-46d09044b17a",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTA0ODZhNzQyZTdkZGEwYmFlNjFjZTJmNTVmYTEzNTI3ZjFjM2IzMzRjNTdjMDM0YmI0Y2YxMzJmYjVmNWYifX19"
    ),
    EVOKER(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "3b8e7675-6d30-45b9-8a39-bde80cff58ff",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQzMzMyMmUyY2NiZDljNTVlZjQxZDk2ZjM4ZGJjNjY2YzgwMzA0NWIyNDM5MWFjOTM5MWRjY2FkN2NkIn19fQ=="
    ),
    VEX(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "7379ac5e-bdec-4792-8e04-4967274da5db",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJlYzVhNTE2NjE3ZmYxNTczY2QyZjlkNWYzOTY5ZjU2ZDU1NzVjNGZmNGVmZWZhYmQyYTE4ZGM3YWI5OGNkIn19fQ=="
    ),
    VINDICATOR(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "c28e1263-45f1-4e19-8af4-01015507fc94",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWUxY2FiMzgyNDU4ZTg0M2FjNDM1NmUzZTAwZTFkMzVjMzZmNDQ5ZmExYTg0NDg4YWIyYzY1NTdiMzkyZCJ9fX0="
    ),
    ILLUSIONER(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "f108e349-dced-4aa1-a8b7-708b728780ad",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTEyNTEyZTdkMDE2YTIzNDNhN2JmZjFhNGNkMTUzNTdhYjg1MTU3OWYxMzg5YmQ0ZTNhMjRjYmViODhiIn19fQ=="
    ),
    CREEPER(
        Material.CREEPER_HEAD,
        Material.CREEPER_WALL_HEAD,
        "c66c91fd-6fb5-414f-b70e-39c19edf3d28",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjQyNTQ4MzhjMzNlYTIyN2ZmY2EyMjNkZGRhYWJmZTBiMDIxNWY3MGRhNjQ5ZTk0NDQ3N2Y0NDM3MGNhNjk1MiJ9fX0="
    ),
    SKELETON(
        Material.SKELETON_SKULL,
        Material.SKELETON_WALL_SKULL,
        "69708f16-9c00-4aa4-9089-247ec1c8d013",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzAxMjY4ZTljNDkyZGExZjBkODgyNzFjYjQ5MmE0YjMwMjM5NWY1MTVhN2JiZjc3ZjRhMjBiOTVmYzAyZWIyIn19fQ=="
    ),
    SPIDER(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "3d461eb4-4601-4d76-b89f-e2bf0bcfc05c",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Q1NDE1NDFkYWFmZjUwODk2Y2QyNThiZGJkZDRjZjgwYzNiYTgxNjczNTcyNjA3OGJmZTM5MzkyN2U1N2YxIn19fQ=="
    ),
    ZOMBIE(
        Material.ZOMBIE_HEAD,
        Material.ZOMBIE_WALL_HEAD,
        "a1985e68-5743-42f5-b67a-8e8dd3f8eb11",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTZmYzg1NGJiODRjZjRiNzY5NzI5Nzk3M2UwMmI3OWJjMTA2OTg0NjBiNTFhNjM5YzYwZTVlNDE3NzM0ZTExIn19fQ=="
    ),
    SLIME(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "625a4069-aa5d-4844-bea0-c133d6978373",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODk1YWVlYzZiODQyYWRhODY2OWY4NDZkNjViYzQ5NzYyNTk3ODI0YWI5NDRmMjJmNDViZjNiYmI5NDFhYmU2YyJ9fX0="
    ),
    GHAST(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "7af3876e-0427-45c5-97ae-7119688cdecf",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGI2YTcyMTM4ZDY5ZmJiZDJmZWEzZmEyNTFjYWJkODcxNTJlNGYxYzk3ZTVmOTg2YmY2ODU1NzFkYjNjYzAifX19"
    ),
    PIG_ZOMBIE(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "24d853db-b5b6-4b46-8cd7-4210c38d246d",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzRlOWM2ZTk4NTgyZmZkOGZmOGZlYjMzMjJjZDE4NDljNDNmYjE2YjE1OGFiYjExY2E3YjQyZWRhNzc0M2ViIn19fQ=="
    ),
    ENDERMAN(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "e229ba57-ec25-4501-87cb-af52d6ee7497",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E1OWJiMGE3YTMyOTY1YjNkOTBkOGVhZmE4OTlkMTgzNWY0MjQ1MDllYWRkNGU2YjcwOWFkYTUwYjljZiJ9fX0="
    ),
    CAVE_SPIDER(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "c1c239ec-22c2-4d2e-ad15-8eb2d2770bcd",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDE2NDVkZmQ3N2QwOTkyMzEwN2IzNDk2ZTk0ZWViNWMzMDMyOWY5N2VmYzk2ZWQ3NmUyMjZlOTgyMjQifX19"
    ),
    SILVERFISH(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "49ff3529-bb63-44ee-99e6-bd57b888463d",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGE5MWRhYjgzOTFhZjVmZGE1NGFjZDJjMGIxOGZiZDgxOWI4NjVlMWE4ZjFkNjIzODEzZmE3NjFlOTI0NTQwIn19fQ=="
    ),
    BLAZE(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "ca339549-96da-4f39-8cb8-ebd5c27b83a3",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjc4ZWYyZTRjZjJjNDFhMmQxNGJmZGU5Y2FmZjEwMjE5ZjViMWJmNWIzNWE0OWViNTFjNjQ2Nzg4MmNiNWYwIn19fQ=="
    ),
    MAGMA_CUBE(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "58014cd9-af29-4ad0-ad62-2e9b16f749bb",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzg5NTdkNTAyM2M5MzdjNGM0MWFhMjQxMmQ0MzQxMGJkYTIzY2Y3OWE5ZjZhYjM2Yjc2ZmVmMmQ3YzQyOSJ9fX0="
    ),
    ENDER_DRAGON(
        Material.DRAGON_HEAD,
        Material.DRAGON_WALL_HEAD,
        "069773eb-ed19-4a82-8ea7-b38a7224e10b",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzRlY2MwNDA3ODVlNTQ2NjNlODU1ZWYwNDg2ZGE3MjE1NGQ2OWJiNGI3NDI0YjczODFjY2Y5NWIwOTVhIn19fQ=="
    ),
    WITHER(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "940486f2-1e1e-4d1f-b77f-1d47a1ba389f",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2U0ZjQ5NTM1YTI3NmFhY2M0ZGM4NDEzM2JmZTgxYmU1ZjJhNDc5OWE0YzA0ZDlhNGRkYjcyZDgxOWVjMmIyYiJ9fX0="
    ),
    BAT(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "19e2f141-789d-4d5e-9cdd-8fbf54af2611",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmIyZDc3NzkyMmZlZTg2NTg4OTM4ZTMxOTNjZjNmNDU0Y2NmODg5ZmQzMTE3MmI0ZjhjMTViZTQ5ZjQzMzg4In19fQ=="
    ),
    WITCH(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "9cc1d9c9-701e-4ecf-9d1b-0822b0a466eb",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjBlMTNkMTg0NzRmYzk0ZWQ1NWFlYjcwNjk1NjZlNDY4N2Q3NzNkYWMxNmY0YzNmODcyMmZjOTViZjlmMmRmYSJ9fX0="
    ),
    ENDERMITE(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "64ce8824-aa7d-456e-a46d-7a03b9fdf5fd",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWJjN2I5ZDM2ZmI5MmI2YmYyOTJiZTczZDMyYzZjNWIwZWNjMjViNDQzMjNhNTQxZmFlMWYxZTY3ZTM5M2EzZSJ9fX0="
    ),
    GUARDIAN(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "5212ce39-d2a0-48d4-8c3d-b588fb970fcf",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTBiZjM0YTcxZTc3MTViNmJhNTJkNWRkMWJhZTVjYjg1Zjc3M2RjOWIwZDQ1N2I0YmZjNWY5ZGQzY2M3Yzk0In19fQ=="
    ),
    SHULKER(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "eb8f9276-54f8-4ce0-917e-3479038e36d1",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFkMzUzNGQyMWZlODQ5OTI2MmRlODdhZmZiZWFjNGQyNWZmZGUzNWM4YmRjYTA2OWU2MWUxNzg3ZmYyZiJ9fX0="
    ),
    PIG(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "afb61daf-4fda-4ac4-9ddd-b2309377bcda",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIxNjY4ZWY3Y2I3OWRkOWMyMmNlM2QxZjNmNGNiNmUyNTU5ODkzYjZkZjRhNDY5NTE0ZTY2N2MxNmFhNCJ9fX0="
    ),
    SHEEP(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "f6aae326-8879-40dd-b491-1d6cb27d8e0d",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjMxZjljY2M2YjNlMzJlY2YxM2I4YTExYWMyOWNkMzNkMThjOTVmYzczZGI4YTY2YzVkNjU3Y2NiOGJlNzAifX19"
    ),
    COW(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "1208f5e1-a040-4a4f-8462-372ffb1cd83d",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWQ2YzZlZGE5NDJmN2Y1ZjcxYzMxNjFjNzMwNmY0YWVkMzA3ZDgyODk1ZjlkMmIwN2FiNDUyNTcxOGVkYzUifX19"
    ),
    CHICKEN(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "fadbdff9-a3e6-471a-8dc3-23e23f9c7acf",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDJkNTEyMmE1YzE0NzU4ODI1YzRlMTkyODQ0Nzg2ZjMxNTI3NTE1OTBhNzcxYmEzMWM4ZDMyMjZhMmE1ZiJ9fX0="
    ),
    SQUID(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "c6f5cd8b-1578-4f8b-a933-17ab193a6fe5",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMDE0MzNiZTI0MjM2NmFmMTI2ZGE0MzRiODczNWRmMWViNWIzY2IyY2VkZTM5MTQ1OTc0ZTljNDgzNjA3YmFjIn19fQ=="
    ),
    WOLF(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "e6f2820d-03e7-4718-b552-76e1aec11638",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGMzZGQ5ODRiYjY1OTg0OWJkNTI5OTQwNDY5NjRjMjI3MjVmNzE3ZTk4NmIxMmQ1NDhmZDE2OTM2N2Q0OTQifX19"
    ),
    MUSHROOM_COW(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "b769f2da-e5a8-4882-b15b-d68618904a63",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDBiYzYxYjk3NTdhN2I4M2UwM2NkMjUwN2EyMTU3OTEzYzJjZjAxNmU3YzA5NmE0ZDZjZjFmZTFiOGRiIn19fQ=="
    ),
    SNOWMAN(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "82a04987-3371-41e2-ac43-91769b4461e7",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWZkZmQxZjc1MzhjMDQwMjU4YmU3YTkxNDQ2ZGE4OWVkODQ1Y2M1ZWY3MjhlYjVlNjkwNTQzMzc4ZmNmNCJ9fX0="
    ),
    OCELOT(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "7f372b3d-c0fb-46df-ae19-4a9ee7584ae5",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTY1N2NkNWMyOTg5ZmY5NzU3MGZlYzRkZGNkYzY5MjZhNjhhMzM5MzI1MGMxYmUxZjBiMTE0YTFkYjEifX19"
    ),
    IRON_GOLEM(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "675bf087-86a1-48b3-b800-1f7d6042a585",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODkwOTFkNzllYTBmNTllZjdlZjk0ZDdiYmE2ZTVmMTdmMmY3ZDQ1NzJjNDRmOTBmNzZjNDgxOWE3MTQifX19"
    ),
    HORSE(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "dc1293f0-c0cb-4a1e-973f-bd36d70a3de9",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2JiNGIyODg5OTFlZmI4Y2EwNzQzYmVjY2VmMzEyNThiMzFkMzlmMjQ5NTFlZmIxYzljMThhNDE3YmE0OGY5In19fQ=="
    ),
    RABBIT(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "39a8931e-4c52-4db6-8acf-0a79746507c7",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2QxMTY5YjI2OTRhNmFiYTgyNjM2MDk5MjM2NWJjZGE1YTEwYzg5YTNhYTJiNDhjNDM4NTMxZGQ4Njg1YzNhNyJ9fX0="
    ),
    POLAR_BEAR(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "da6aeada-b809-424b-a653-9ba6e4b01262",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Q1ZDYwYTRkNzBlYzEzNmE2NTg1MDdjZTgyZTM0NDNjZGFhMzk1OGQ3ZmNhM2Q5Mzc2NTE3YzdkYjRlNjk1ZCJ9fX0="
    ),
    LLAMA(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "dc8d5e11-535c-47b3-9565-74d94f1782c2",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJiMWVjZmY3N2ZmZTNiNTAzYzMwYTU0OGViMjNhMWEwOGZhMjZmZDY3Y2RmZjM4OTg1NWQ3NDkyMTM2OCJ9fX0="
    ),
    PARROT(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "2133c894-2dcc-4492-bbf5-29d4cad0d423",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmI5NGYyMzZjNGE2NDJlYjJiY2RjMzU4OWI5YzNjNGEwYjViZDVkZjljZDVkNjhmMzdmOGM4M2Y4ZTNmMSJ9fX0="
    ),
    VILLAGER(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "08bf8f8a-61d5-4bc1-8761-4185f2fa3136",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFiODMwZWI0MDgyYWNlYzgzNmJjODM1ZTQwYTExMjgyYmI1MTE5MzMxNWY5MTE4NDMzN2U4ZDM1NTU1ODMifX19"
    ),
    TURTLE(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "3283acfe-e846-42a8-a555-7e2940b58ae4",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMGE0MDUwZTdhYWNjNDUzOTIwMjY1OGZkYzMzOWRkMTgyZDdlMzIyZjlmYmNjNGQ1Zjk5YjU3MThhIn19fQ=="
    ),
    PHANTOM(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "385f1bf3-12d8-4246-87fc-2622a415a312",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzQ2ODMwZGE1ZjgzYTNhYWVkODM4YTk5MTU2YWQ3ODFhNzg5Y2ZjZjEzZTI1YmVlZjdmNTRhODZlNGZhNCJ9fX0="
    ),
    COD(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "d8645871-ea91-4742-a0a3-0f86dc49653b",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzg5MmQ3ZGQ2YWFkZjM1Zjg2ZGEyN2ZiNjNkYTRlZGRhMjExZGY5NmQyODI5ZjY5MTQ2MmE0ZmIxY2FiMCJ9fX0="
    ),
    SALMON(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "35968ced-177a-4cef-9b3f-a8cbcdc7659e",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGFlYjIxYTI1ZTQ2ODA2Y2U4NTM3ZmJkNjY2ODI4MWNmMTc2Y2VhZmU5NWFmOTBlOTRhNWZkODQ5MjQ4NzgifX19"
    ),
    PUFFERFISH(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "c5f9816d-7415-43f6-8e40-6f3b2dab3c33",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTcxNTI4NzZiYzNhOTZkZDJhMjI5OTI0NWVkYjNiZWVmNjQ3YzhhNTZhYzg4NTNhNjg3YzNlN2I1ZDhiYiJ9fX0="
    ),
    TROPICAL_FISH(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "6c2851ca-37b3-4f29-8415-c3d03f32e27d",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjZDcxZmJiYmJiNjZjN2JhZjc4ODFmNDE1YzY0ZmE4NGY2NTA0OTU4YTU3Y2NkYjg1ODkyNTI2NDdlYSJ9fX0="
    ),
    DROWNED(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "937deebb-00ac-4304-adbf-d7968421a4a2",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzNmN2NjZjYxZGJjM2Y5ZmU5YTYzMzNjZGUwYzBlMTQzOTllYjJlZWE3MWQzNGNmMjIzYjNhY2UyMjA1MSJ9fX0="
    ),
    DOLPHIN(
        Material.PLAYER_HEAD,
        Material.PLAYER_WALL_HEAD,
        "9cd54916-35e6-4728-aac8-1850cb91d051",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGU5Njg4Yjk1MGQ4ODBiNTViN2FhMmNmY2Q3NmU1YTBmYTk0YWFjNmQxNmY3OGU4MzNmNzQ0M2VhMjlmZWQzIn19fQ=="
    );
    private final UUID owner;
    private final String texture;
    
    private final Material material;
    private final Material wallMaterial;
    
    
    private static class Mappings{
        public static final HashMap<UUID,TexturedSkullType> skullsById = new HashMap<>();
    }
            
    TexturedSkullType(Material material, Material wallMaterial, String ownerUUID, String texture){
        this(material,wallMaterial,UUID.fromString(ownerUUID),texture);
    }
    TexturedSkullType(Material material, Material wallMaterial, UUID owner, String texture){
        this.owner=owner;
        this.texture = texture;
        this.material=material;
        this.wallMaterial=wallMaterial;
        Mappings.skullsById.put(owner, this);
    }
    public UUID getOwner() {
        return owner;
    }
    public String getTexture(){
        return texture;
    }
    public Material getMaterial(){
        return material;
    }
    public Material getWallMaterial(){
        return wallMaterial;
    }
    
    public static TexturedSkullType get(UUID owner) {
        return Mappings.skullsById.get(owner);
    }
    
    public String getDisplayName() {
        return Tools.format(Lang.getString("HEAD_" + name()));
    }
    public String getSpawnName() {
        return Lang.getString("HEAD_SPAWN_" + name());
    }
    public boolean isPlayerHead(){
        return this.material.equals(Material.PLAYER_HEAD);
    }
    public boolean hasDedicatedItem(){
        return !isPlayerHead();
    }
}
