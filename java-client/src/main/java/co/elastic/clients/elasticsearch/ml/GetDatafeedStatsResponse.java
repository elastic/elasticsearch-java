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

// typedef: ml.get_datafeed_stats.Response
@JsonpDeserializable
public final class GetDatafeedStatsResponse implements JsonpSerializable {
	private final long count;

	private final List<DatafeedStats> datafeeds;

	// ---------------------------------------------------------------------------------------------

	public GetDatafeedStatsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.datafeeds = ModelTypeHelper.unmodifiableNonNull(builder.datafeeds, "datafeeds");

	}

	public GetDatafeedStatsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code datafeeds}
	 */
	public List<DatafeedStats> datafeeds() {
		return this.datafeeds;
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

		generator.writeKey("datafeeds");
		generator.writeStartArray();
		for (DatafeedStats item0 : this.datafeeds) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDatafeedStatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetDatafeedStatsResponse> {
		private Long count;

		private List<DatafeedStats> datafeeds;

		/**
		 * Required - API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code datafeeds}
		 */
		public Builder datafeeds(List<DatafeedStats> value) {
			this.datafeeds = value;
			return this;
		}

		/**
		 * Required - API name: {@code datafeeds}
		 */
		public Builder datafeeds(DatafeedStats... value) {
			this.datafeeds = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #datafeeds(List)}, creating the list if needed.
		 */
		public Builder addDatafeeds(DatafeedStats value) {
			if (this.datafeeds == null) {
				this.datafeeds = new ArrayList<>();
			}
			this.datafeeds.add(value);
			return this;
		}

		/**
		 * Set {@link #datafeeds(List)} to a singleton list.
		 */
		public Builder datafeeds(Function<DatafeedStats.Builder, ObjectBuilder<DatafeedStats>> fn) {
			return this.datafeeds(fn.apply(new DatafeedStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #datafeeds(List)}, creating the list if needed.
		 */
		public Builder addDatafeeds(Function<DatafeedStats.Builder, ObjectBuilder<DatafeedStats>> fn) {
			return this.addDatafeeds(fn.apply(new DatafeedStats.Builder()).build());
		}

		/**
		 * Builds a {@link GetDatafeedStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDatafeedStatsResponse build() {

			return new GetDatafeedStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetDatafeedStatsResponse}
	 */
	public static final JsonpDeserializer<GetDatafeedStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetDatafeedStatsResponse::setupGetDatafeedStatsResponseDeserializer, Builder::build);

	protected static void setupGetDatafeedStatsResponseDeserializer(
			DelegatingDeserializer<GetDatafeedStatsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::datafeeds, JsonpDeserializer.arrayDeserializer(DatafeedStats._DESERIALIZER), "datafeeds");

	}

}
