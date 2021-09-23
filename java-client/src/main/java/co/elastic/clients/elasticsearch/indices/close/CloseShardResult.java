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

package co.elastic.clients.elasticsearch.indices.close;

import co.elastic.clients.elasticsearch._types.ShardFailure;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.close.CloseShardResult
public final class CloseShardResult implements JsonpSerializable {
	private final List<ShardFailure> failures;

	// ---------------------------------------------------------------------------------------------

	public CloseShardResult(Builder builder) {

		this.failures = Objects.requireNonNull(builder.failures, "failures");

	}

	/**
	 * API name: {@code failures}
	 */
	public List<ShardFailure> failures() {
		return this.failures;
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

		generator.writeKey("failures");
		generator.writeStartArray();
		for (ShardFailure item0 : this.failures) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseShardResult}.
	 */
	public static class Builder implements ObjectBuilder<CloseShardResult> {
		private List<ShardFailure> failures;

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(List<ShardFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(ShardFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(ShardFailure value) {
			if (this.failures == null) {
				this.failures = new ArrayList<>();
			}
			this.failures.add(value);
			return this;
		}

		/**
		 * Set {@link #failures(List)} to a singleton list.
		 */
		public Builder failures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.failures(fn.apply(new ShardFailure.Builder()).build());
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.addFailures(fn.apply(new ShardFailure.Builder()).build());
		}

		/**
		 * Builds a {@link CloseShardResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseShardResult build() {

			return new CloseShardResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CloseShardResult}
	 */
	public static final JsonpDeserializer<CloseShardResult> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CloseShardResult::setupCloseShardResultDeserializer);

	protected static void setupCloseShardResultDeserializer(DelegatingDeserializer<CloseShardResult.Builder> op) {

		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ShardFailure.DESERIALIZER), "failures");

	}

}
