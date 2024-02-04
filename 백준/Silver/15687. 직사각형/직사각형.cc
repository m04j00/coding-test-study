class Rectangle {
private:
	int width;
	int height;
public:
	Rectangle(int width, int height) {
        if(0 < width && width <= 1000 && 0 < height && height <= 2000){
            this->width = width;
            this->height = height;
        }

	}
	int get_width() const {
		return width;
	}
	int get_height() const {
		return height;
	}
	void set_width(int width) {
		if(0 < width && width <= 1000){
            this->width = width;
        }
	}
	void set_height(int height) {
		if(0 < height && height <= 2000){
            this->height = height;
        }
	}
	int area() const {
		return width * height;
	}
	int perimeter() const {
		return 2 * (width + height);
	}
	bool is_square() const {
		if (width == height) return true;
		
		return false;
	}
};
