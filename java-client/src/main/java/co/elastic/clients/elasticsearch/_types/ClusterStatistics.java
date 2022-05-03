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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.ClusterStatistics

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.ClusterStatistics">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterStatistics implements JsonpSerializable {
	private final int skipped;

	private final int successful;

	private final int total;

	// ---------------------------------------------------------------------------------------------

	private ClusterStatistics(Builder builder) {

		this.skipped = ApiTypeHelper.requireNonNull(builder.skipped, this, "skipped");
		this.successful = ApiTypeHelper.requireNonNull(builder.successful, this, "successful");
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static ClusterStatistics of(Function<Builder, ObjectBuilder<ClusterStatistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code skipped}
	 */
	public final int skipped() {
		return this.skipped;
	}

	/**
	 * Required - API name: {@code successful}
	 */
	public final int successful() {
		return this.successful;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final int total() {
		return this.total;
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

		generator.writeKey("skipped");
		generator.write(this.skipped);

		generator.writeKey("successful");
		generator.write(this.successful);

		generator.writeKey("total");
		generator.write(this.total);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStatistics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ClusterStatistics> {
		private Integer skipped;

		private Integer successful;

		private Integer total;

		/**
		 * Required - API name: {@code skipped}
		 */
		public final Builder skipped(int value) {
			this.skipped = value;
			return this;
		}

		/**
		 * Required - API name: {@code successful}
		 */
		public final Builder successful(int value) {
			this.successful = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStatistics build() {
			_checkSingleUse();

			return new ClusterStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStatistics}
	 */
	public static final JsonpDeserializer<ClusterStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterStatistics::setupClusterStatisticsDeserializer);

	protected static void setupClusterStatisticsDeserializer(ObjectDeserializer<ClusterStatistics.Builder> op) {

		op.add(Builder::skipped, JsonpDeserializer.integerDeserializer(), "skipped");
		op.add(Builder::successful, JsonpDeserializer.integerDeserializer(), "successful");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");

	}

}
