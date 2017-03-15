#/usr/bin/sh

command -v qrencode >/dev/null 2>&1 || {
  echo >&2 "I require qrencode but it's not installed.  Aborting.";
  exit 1;
}

rand_str () {
  local str_len=${1:-4}

  cat /dev/urandom | tr -dc 'a-z0-9' | fold -w $str_len | head -n 1
}

rand_qr () {
  local str1=$(rand_str 2)
  local str2=$(rand_str 2)
  local str3=$(rand_str 2)
  local str="$str1-$str2-$str3"
  local ext=".png"

  qrencode -o $str$ext $str
  display     $str$ext
}

rand_qr
