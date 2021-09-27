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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.ClusterStatistics
@JsonpDeserializable
public final class ClusterStatistics implements JsonpSerializable {
	private final Integer skipped;

	private final Integer successful;

	private final Integer total;

	// ---------------------------------------------------------------------------------------------

	public ClusterStatistics(Builder builder) {

		this.skipped = Objects.requireNonNull(builder.skipped, "skipped");
		this.successful = Objects.requireNonNull(builder.successful, "successful");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	/**
	 * API name: {@code skipped}
	 */
	public Integer skipped() {
		return this.skipped;
	}

	/**
	 * API name: {@code successful}
	 */
	public Integer successful() {
		return this.successful;
	}

	/**
	 * API name: {@code total}
	 */
	public Integer total() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStatistics}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStatistics> {
		private Integer skipped;

		private Integer successful;

		private Integer total;

		/**
		 * API name: {@code skipped}
		 */
		public Builder skipped(Integer value) {
			this.skipped = value;
			return this;
		}

		/**
		 * API name: {@code successful}
		 */
		public Builder successful(Integer value) {
			this.successful = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Integer value) {
			this.total = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStatistics build() {

			return new ClusterStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStatistics}
	 */
	public static final JsonpDeserializer<ClusterStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterStatistics::setupClusterStatisticsDeserializer, Builder::build);

	protected static void setupClusterStatisticsDeserializer(DelegatingDeserializer<ClusterStatistics.Builder> op) {

		op.add(Builder::skipped, JsonpDeserializer.integerDeserializer(), "skipped");
		op.add(Builder::successful, JsonpDeserializer.integerDeserializer(), "successful");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");

	}

}
