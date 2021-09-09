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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_records.Response
public final class GetRecordsResponse implements ToJsonp {
	private final Number count;

	private final List<Anomaly> records;

	// ---------------------------------------------------------------------------------------------

	protected GetRecordsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.records = Objects.requireNonNull(builder.records, "records");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("records");
		generator.writeStartArray();
		for (Anomaly item0 : this.records) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRecordsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetRecordsResponse> {
		private Number count;

		private List<Anomaly> records;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
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
		 * Add a value to {@link #records(List)}, creating the list if needed.
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
		 * Add a value to {@link #records(List)}, creating the list if needed.
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
	 * Json deserializer for GetRecordsResponse
	 */
	public static final JsonpDeserializer<GetRecordsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetRecordsResponse::setupGetRecordsResponseDeserializer);

	protected static void setupGetRecordsResponseDeserializer(DelegatingDeserializer<GetRecordsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::records, JsonpDeserializer.arrayDeserializer(Anomaly.DESERIALIZER), "records");

	}

}
