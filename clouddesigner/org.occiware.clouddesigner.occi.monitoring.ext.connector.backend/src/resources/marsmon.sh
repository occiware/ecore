#! /bin/bash
printf "Memory;Disk;LOAD;CPU\n"
while true
do
  MEMORY=$(free -m | awk 'NR==2{printf "%.2f;", $3*100/$2 }')
  DISK=$(df -h | awk '$NF=="/"{printf "%s;", $5}')
# CPU LOAD.
# LOAD=$(top -bn1 | grep load | awk '{printf "%.2f;", $(NF-2)}')
  LOAD=$(cat /proc/loadavg | awk '{printf "%.2f;", $1 }')

# CPU part.
  CPU=`awk '/\#define HZ/ {print $3}' /usr/include/asm-generic/param.h`
  NUMCPUS=`grep ^proc /proc/cpuinfo | wc -l`
  FIRST=`cat /proc/stat | awk '/^cpu / {print $5}'`
  sleep 1
  SECOND=`cat /proc/stat | awk '/^cpu / {print $5}'`
  USED=`echo 2 k 100 $SECOND $FIRST - $NUMCPUS $CPU \* / 100 \* - p | dc`

  echo "$MEMORY$DISK$LOAD$USED" | sed "s/%//"

  # sleep 5
done

# end=$((SECONDS+3600))
# while [ $SECONDS -lt $end ]; do
