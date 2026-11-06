/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.data_recovery;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: data_recovery._types.Point

/**
 *
 * @see <a href="../doc-files/api-spec.html#data_recovery._types.Point">API
 *      specification</a>
 */
@JsonpDeserializable
public class Point implements JsonpSerializable {
	private final DateTime startTime;

	private final DateTime endTime;

	// ---------------------------------------------------------------------------------------------

	private Point(Builder builder) {

		this.startTime = ApiTypeHelper.requireNonNull(builder.startTime, this, "startTime");
		this.endTime = ApiTypeHelper.requireNonNull(builder.endTime, this, "endTime");

	}

	public static Point of(Function<Builder, ObjectBuilder<Point>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The time when creation of the recovery point started.
	 * <p>
	 * API name: {@code start_time}
	 */
	public final DateTime startTime() {
		return this.startTime;
	}

	/**
	 * Required - The time when creation of the recovery point completed.
	 * <p>
	 * API name: {@code end_time}
	 */
	public final DateTime endTime() {
		return this.endTime;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("start_time");
		this.startTime.serialize(generator, mapper);
		generator.writeKey("end_time");
		this.endTime.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Point}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Point> {
		private DateTime startTime;

		private DateTime endTime;

		public Builder() {
		}
		private Builder(Point instance) {
			this.startTime = instance.startTime;
			this.endTime = instance.endTime;

		}
		/**
		 * Required - The time when creation of the recovery point started.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(DateTime value) {
			this.startTime = value;
			return this;
		}

		/**
		 * Required - The time when creation of the recovery point completed.
		 * <p>
		 * API name: {@code end_time}
		 */
		public final Builder endTime(DateTime value) {
			this.endTime = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Point}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Point build() {
			_checkSingleUse();

			return new Point(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Point}
	 */
	public static final JsonpDeserializer<Point> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Point::setupPointDeserializer);

	protected static void setupPointDeserializer(ObjectDeserializer<Point.Builder> op) {

		op.add(Builder::startTime, DateTime._DESERIALIZER, "start_time");
		op.add(Builder::endTime, DateTime._DESERIALIZER, "end_time");

	}

}
