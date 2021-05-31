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

package co.elastic.clients.elasticsearch.indices.stats;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardLease
public final class ShardLease implements ToJsonp {
	private final String id;

	private final Number retainingSeqNo;

	private final Number timestamp;

	private final String source;

	// ---------------------------------------------------------------------------------------------

	protected ShardLease(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.retainingSeqNo = Objects.requireNonNull(builder.retainingSeqNo, "retaining_seq_no");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.source = Objects.requireNonNull(builder.source, "source");

	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code retaining_seq_no}
	 */
	public Number retainingSeqNo() {
		return this.retainingSeqNo;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public Number timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code source}
	 */
	public String source() {
		return this.source;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("retaining_seq_no");
		generator.write(this.retainingSeqNo.doubleValue());

		generator.writeKey("timestamp");
		generator.write(this.timestamp.doubleValue());

		generator.writeKey("source");
		generator.write(this.source);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardLease}.
	 */
	public static class Builder implements ObjectBuilder<ShardLease> {
		private String id;

		private Number retainingSeqNo;

		private Number timestamp;

		private String source;

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code retaining_seq_no}
		 */
		public Builder retainingSeqNo(Number value) {
			this.retainingSeqNo = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(Number value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(String value) {
			this.source = value;
			return this;
		}

		/**
		 * Builds a {@link ShardLease}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardLease build() {

			return new ShardLease(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ShardLease
	 */
	public static final JsonpValueParser<ShardLease> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ShardLease::setupShardLeaseParser);

	protected static void setupShardLeaseParser(DelegatingJsonpValueParser<ShardLease.Builder> op) {

		op.add(Builder::id, JsonpValueParser.stringParser(), "id");
		op.add(Builder::retainingSeqNo, JsonpValueParser.numberParser(), "retaining_seq_no");
		op.add(Builder::timestamp, JsonpValueParser.numberParser(), "timestamp");
		op.add(Builder::source, JsonpValueParser.stringParser(), "source");

	}

}
