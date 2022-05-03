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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_records.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.get_records.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetRecordsResponse implements JsonpSerializable {
	private final long count;

	private final List<Anomaly> records;

	// ---------------------------------------------------------------------------------------------

	private GetRecordsResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.records = ApiTypeHelper.unmodifiableRequired(builder.records, this, "records");

	}

	public static GetRecordsResponse of(Function<Builder, ObjectBuilder<GetRecordsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code records}
	 */
	public final List<Anomaly> records() {
		return this.records;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ApiTypeHelper.isDefined(this.records)) {
			generator.writeKey("records");
			generator.writeStartArray();
			for (Anomaly item0 : this.records) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRecordsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetRecordsResponse> {
		private Long count;

		private List<Anomaly> records;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code records}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>records</code>.
		 */
		public final Builder records(List<Anomaly> list) {
			this.records = _listAddAll(this.records, list);
			return this;
		}

		/**
		 * Required - API name: {@code records}
		 * <p>
		 * Adds one or more values to <code>records</code>.
		 */
		public final Builder records(Anomaly value, Anomaly... values) {
			this.records = _listAdd(this.records, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code records}
		 * <p>
		 * Adds a value to <code>records</code> using a builder lambda.
		 */
		public final Builder records(Function<Anomaly.Builder, ObjectBuilder<Anomaly>> fn) {
			return records(fn.apply(new Anomaly.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRecordsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRecordsResponse build() {
			_checkSingleUse();

			return new GetRecordsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetRecordsResponse}
	 */
	public static final JsonpDeserializer<GetRecordsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetRecordsResponse::setupGetRecordsResponseDeserializer);

	protected static void setupGetRecordsResponseDeserializer(ObjectDeserializer<GetRecordsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::records, JsonpDeserializer.arrayDeserializer(Anomaly._DESERIALIZER), "records");

	}

}
