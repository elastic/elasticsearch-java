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

package co.elastic.clients.elasticsearch.slm;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: slm._types.Retention
@JsonpDeserializable
public final class Retention implements JsonpSerializable {
	private final String expireAfter;

	private final int maxCount;

	private final int minCount;

	// ---------------------------------------------------------------------------------------------

	public Retention(Builder builder) {

		this.expireAfter = Objects.requireNonNull(builder.expireAfter, "expire_after");
		this.maxCount = Objects.requireNonNull(builder.maxCount, "max_count");
		this.minCount = Objects.requireNonNull(builder.minCount, "min_count");

	}

	public Retention(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Time period after which a snapshot is considered expired and eligible for
	 * deletion. SLM deletes expired snapshots based on the slm.retention_schedule.
	 * <p>
	 * API name: {@code expire_after}
	 */
	public String expireAfter() {
		return this.expireAfter;
	}

	/**
	 * Maximum number of snapshots to retain, even if the snapshots have not yet
	 * expired. If the number of snapshots in the repository exceeds this limit, the
	 * policy retains the most recent snapshots and deletes older snapshots.
	 * <p>
	 * API name: {@code max_count}
	 */
	public int maxCount() {
		return this.maxCount;
	}

	/**
	 * Minimum number of snapshots to retain, even if the snapshots have expired.
	 * <p>
	 * API name: {@code min_count}
	 */
	public int minCount() {
		return this.minCount;
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

		generator.writeKey("expire_after");
		generator.write(this.expireAfter);

		generator.writeKey("max_count");
		generator.write(this.maxCount);

		generator.writeKey("min_count");
		generator.write(this.minCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Retention}.
	 */
	public static class Builder implements ObjectBuilder<Retention> {
		private String expireAfter;

		private Integer maxCount;

		private Integer minCount;

		/**
		 * Time period after which a snapshot is considered expired and eligible for
		 * deletion. SLM deletes expired snapshots based on the slm.retention_schedule.
		 * <p>
		 * API name: {@code expire_after}
		 */
		public Builder expireAfter(String value) {
			this.expireAfter = value;
			return this;
		}

		/**
		 * Maximum number of snapshots to retain, even if the snapshots have not yet
		 * expired. If the number of snapshots in the repository exceeds this limit, the
		 * policy retains the most recent snapshots and deletes older snapshots.
		 * <p>
		 * API name: {@code max_count}
		 */
		public Builder maxCount(int value) {
			this.maxCount = value;
			return this;
		}

		/**
		 * Minimum number of snapshots to retain, even if the snapshots have expired.
		 * <p>
		 * API name: {@code min_count}
		 */
		public Builder minCount(int value) {
			this.minCount = value;
			return this;
		}

		/**
		 * Builds a {@link Retention}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Retention build() {

			return new Retention(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Retention}
	 */
	public static final JsonpDeserializer<Retention> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Retention::setupRetentionDeserializer, Builder::build);

	protected static void setupRetentionDeserializer(DelegatingDeserializer<Retention.Builder> op) {

		op.add(Builder::expireAfter, JsonpDeserializer.stringDeserializer(), "expire_after");
		op.add(Builder::maxCount, JsonpDeserializer.integerDeserializer(), "max_count");
		op.add(Builder::minCount, JsonpDeserializer.integerDeserializer(), "min_count");

	}

}
