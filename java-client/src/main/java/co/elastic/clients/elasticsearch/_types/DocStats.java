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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.DocStats
public final class DocStats implements JsonpSerializable {
	private final Number count;

	private final Number deleted;

	// ---------------------------------------------------------------------------------------------

	public DocStats(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.deleted = Objects.requireNonNull(builder.deleted, "deleted");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code deleted}
	 */
	public Number deleted() {
		return this.deleted;
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
		generator.write(this.count.doubleValue());

		generator.writeKey("deleted");
		generator.write(this.deleted.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocStats}.
	 */
	public static class Builder implements ObjectBuilder<DocStats> {
		private Number count;

		private Number deleted;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code deleted}
		 */
		public Builder deleted(Number value) {
			this.deleted = value;
			return this;
		}

		/**
		 * Builds a {@link DocStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocStats build() {

			return new DocStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DocStats}
	 */
	public static final JsonpDeserializer<DocStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DocStats::setupDocStatsDeserializer);

	protected static void setupDocStatsDeserializer(DelegatingDeserializer<DocStats.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::deleted, JsonpDeserializer.numberDeserializer(), "deleted");

	}

}
