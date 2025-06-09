SELECT COUNT(*) AS fish_count
FROM fish_info a
JOIN fish_name_info b ON a.fish_type = b.fish_type
WHERE fish_name LIKE '%BASS%'
   OR fish_name LIKE '%SNAPPER%';
