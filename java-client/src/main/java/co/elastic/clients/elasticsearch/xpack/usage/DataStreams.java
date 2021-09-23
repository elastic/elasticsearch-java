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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.DataStreams
public final class DataStreams extends Base {
	private final Number dataStreams;

	private final Number indicesCount;

	// ---------------------------------------------------------------------------------------------

	public DataStreams(Builder builder) {
		super(builder);

		this.dataStreams = Objects.requireNonNull(builder.dataStreams, "data_streams");
		this.indicesCount = Objects.requireNonNull(builder.indicesCount, "indices_count");

	}

	/**
	 * API name: {@code data_streams}
	 */
	public Number dataStreams() {
		return this.dataStreams;
	}

	/**
	 * API name: {@code indices_count}
	 */
	public Number indicesCount() {
		return this.indicesCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("data_streams");
		generator.write(this.dataStreams.doubleValue());

		generator.writeKey("indices_count");
		generator.write(this.indicesCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreams}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<DataStreams> {
		private Number dataStreams;

		private Number indicesCount;

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(Number value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * API name: {@code indices_count}
		 */
		public Builder indicesCount(Number value) {
			this.indicesCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreams}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreams build() {

			return new DataStreams(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreams}
	 */
	public static final JsonpDeserializer<DataStreams> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DataStreams::setupDataStreamsDeserializer);

	protected static void setupDataStreamsDeserializer(DelegatingDeserializer<DataStreams.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::dataStreams, JsonpDeserializer.numberDeserializer(), "data_streams");
		op.add(Builder::indicesCount, JsonpDeserializer.numberDeserializer(), "indices_count");

	}

}
