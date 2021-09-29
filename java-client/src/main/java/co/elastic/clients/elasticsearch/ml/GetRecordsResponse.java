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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_records.Response
@JsonpDeserializable
public final class GetRecordsResponse implements JsonpSerializable {
	private final long count;

	private final List<Anomaly> records;

	// ---------------------------------------------------------------------------------------------

	public GetRecordsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.records = ModelTypeHelper.unmodifiableNonNull(builder.records, "records");

	}

	public GetRecordsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * API name: {@code records}
	 */
	public List<Anomaly> records() {
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

		generator.writeKey("records");
		generator.writeStartArray();
		for (Anomaly item0 : this.records) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRecordsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetRecordsResponse> {
		private Long count;

		private List<Anomaly> records;

		/**
		 * API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code records}
		 */
		public Builder records(List<Anomaly> value) {
			this.records = value;
			return this;
		}

		/**
		 * API name: {@code records}
		 */
		public Builder records(Anomaly... value) {
			this.records = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #records(List)}, creating the list if needed. 4
		 */
		public Builder addRecords(Anomaly value) {
			if (this.records == null) {
				this.records = new ArrayList<>();
			}
			this.records.add(value);
			return this;
		}

		/**
		 * Set {@link #records(List)} to a singleton list.
		 */
		public Builder records(Function<Anomaly.Builder, ObjectBuilder<Anomaly>> fn) {
			return this.records(fn.apply(new Anomaly.Builder()).build());
		}

		/**
		 * Add a value to {@link #records(List)}, creating the list if needed. 5
		 */
		public Builder addRecords(Function<Anomaly.Builder, ObjectBuilder<Anomaly>> fn) {
			return this.addRecords(fn.apply(new Anomaly.Builder()).build());
		}

		/**
		 * Builds a {@link GetRecordsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRecordsResponse build() {

			return new GetRecordsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetRecordsResponse}
	 */
	public static final JsonpDeserializer<GetRecordsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetRecordsResponse::setupGetRecordsResponseDeserializer, Builder::build);

	protected static void setupGetRecordsResponseDeserializer(DelegatingDeserializer<GetRecordsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::records, JsonpDeserializer.arrayDeserializer(Anomaly._DESERIALIZER), "records");

	}

}
