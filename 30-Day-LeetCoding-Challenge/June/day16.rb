require 'ipaddr'

def valid_ip_address(ip)
  ip.gsub!('::', ':0000:0000:')

  begin
    ip = IPAddr.new(ip)
  rescue IPAddr::InvalidAddressError
    return 'Neither'
  end

  ip.ipv6? ? 'IPv6' : 'IPv4'
end